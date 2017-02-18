package zjut.sy.dao;

import org.springframework.stereotype.Repository;
import zjut.sy.basic.dao.BaseDao;
import zjut.sy.basic.model.Pager;
import zjut.sy.model.Admin;
import zjut.sy.model.Teacher;

/**
 * Created by dell on 2016/5/12.
 */
@SuppressWarnings("JpaQlInspection")
@Repository(value = "adminDao")
public class AdminDao extends BaseDao<Admin> implements IAdminDao {
    @Override
    public Admin loadByAdminname(String username) {
        String hql="from Admin a where a.username=?";
        return (Admin) this.getSession().createQuery(hql).setParameter(0,username).uniqueResult();
    }

    @Override
    public Pager<Admin> findAdmin() {
        return this.find("from Admin");
    }
}
