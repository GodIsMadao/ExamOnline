package zjut.sy.service;

import zjut.sy.basic.model.Pager;
import zjut.sy.model.Admin;

/**
 * Created by dell on 2016/5/12.
 */
public interface IAdminService {

    //更新
    public void updateAdminInfo(Admin admin);
    //登陆
    public Admin login(String username,String password);

    public Admin load(int id);

    public Pager<Admin> findAdmin();

    public void addAdmin(Admin admin);
}
