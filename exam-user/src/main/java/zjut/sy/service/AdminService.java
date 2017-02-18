package zjut.sy.service;

import org.springframework.stereotype.Service;
import zjut.sy.basic.model.Pager;
import zjut.sy.dao.AdminDao;
import zjut.sy.model.Admin;
import zjut.sy.model.ExamException;

import javax.inject.Inject;

/**
 * Created by dell on 2016/5/12.
 */
@Service("adminService")
public class AdminService implements  IAdminService {
    private AdminDao adminDao;

    public AdminDao getAdminDao() {
        return adminDao;
    }

    @Inject
    public void setAdminDao(AdminDao adminDao) {
        this.adminDao = adminDao;
    }

    @Override
    public Admin login(String username, String password) {
        Admin admin=adminDao.loadByAdminname(username);
        if(admin==null)throw new ExamException("用户名或密码不正确");
        return admin;
    }

    @Override
    public Admin load(int id) {
        return adminDao.load(id);
    }

    @Override
    public void updateAdminInfo(Admin admin) {
        adminDao.update(admin);
    }

    @Override
    public Pager<Admin> findAdmin() {
        return adminDao.findAdmin();
    }

    @Override
    public void addAdmin(Admin admin) {
        Admin an=adminDao.loadByAdminname(admin.getUsername());
        if(an!=null)throw new ExamException("添加的管理员已存在，不能添加");
        adminDao.add(admin);
    }
}
