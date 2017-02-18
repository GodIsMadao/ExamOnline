package zjut.sy.test.dao;

import org.dbunit.DatabaseUnitException;
import org.dbunit.dataset.IDataSet;
import org.dbunit.operation.DatabaseOperation;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.orm.hibernate4.SessionHolder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import zjut.sy.dao.IExampaperDao;
import zjut.sy.dao.IQuestionDao;
import zjut.sy.dao.IStudentDao;
import zjut.sy.dao.ITeacherDao;
import zjut.sy.model.Student;
import zjut.sy.test.util.AbstractDbUnitTestCase;
import zjut.sy.test.util.EntitiesHelper;

import javax.inject.Inject;
import javax.persistence.Entity;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by dell on 2016/5/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/beans.xml")
public class TestStudentDao extends AbstractDbUnitTestCase{
    @Inject
    private SessionFactory sessionFactory;
    @Inject
    private IStudentDao studentDao;
    @Inject
    private IExampaperDao exampaperDao;
    @Inject
    private ITeacherDao teacherDao;
    @Inject
    private IQuestionDao questionDao;

    @Before
    public void setUp() throws SQLException, IOException, DatabaseUnitException {
        Session s = sessionFactory.openSession();
        TransactionSynchronizationManager.bindResource(sessionFactory, new SessionHolder(s));
        this.backupAllTable();
        IDataSet ds = createDateSet("table");
        DatabaseOperation.CLEAN_INSERT.execute(dbunitCon,ds);
    }
    @Test
    public void testLoadByStudentname(){
        Student as= EntitiesHelper.getBaseStudent();
        String username="student1";
        Student es=studentDao.loadByStudentname(username);
        EntitiesHelper.assertStudent(as,es);
    }
    @After
    public void tearDown() throws IOException, DatabaseUnitException, SQLException {
        SessionHolder holder = (SessionHolder) TransactionSynchronizationManager.getResource(sessionFactory);
        Session s = holder.getSession();
        s.flush();
        TransactionSynchronizationManager.unbindResource(sessionFactory);
//		this.resumeTable();
    }
}
