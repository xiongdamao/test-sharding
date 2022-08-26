package test;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author author
 * @since 2022-05-28
 */
@Service
@Slf4j
public class UserServiceImpl {
    @Autowired
    UserMapper baseMapper;

    public int merge(User user) {
        log.info("{}", user);
        return this.baseMapper.merge(user);
    }

    public List<User> list() {

        return this.baseMapper.list();
    }
}


