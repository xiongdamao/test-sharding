package test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author author
 * @since 2022-05-28
 */
@Service
public class UserServiceImpl {
    @Autowired
    UserMapper baseMapper;

    public int merge(User user) {
        return this.baseMapper.merge(user);
    }
}


