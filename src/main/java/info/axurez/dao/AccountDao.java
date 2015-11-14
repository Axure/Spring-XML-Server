package info.axurez.dao;

import info.axurez.model.Account;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by zhenghu on 15 年 September. 5..
 */
public interface AccountDao extends CrudRepository<Account, Integer> {

}
