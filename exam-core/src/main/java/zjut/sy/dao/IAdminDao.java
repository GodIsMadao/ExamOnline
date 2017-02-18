package zjut.sy.dao;

import zjut.sy.basic.dao.IBaseDao;
import zjut.sy.basic.model.Pager;
import zjut.sy.model.Admin;
import zjut.sy.model.Teacher;

/**
 * Created by dell on 2016/5/12.
 */
public interface IAdminDao extends IBaseDao<Admin>{
    public Admin loadByAdminname(String username);

    public Pager<Admin> findAdmin();
}
