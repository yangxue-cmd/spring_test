import com.spring.domain.Account;
import com.spring.service.IAccountService;
import com.spring.service.impl.AccountService;
import config.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= SpringConfig.class)
public class SpringTest {
    @Autowired
    private AccountService accountService;
    @Test
    public void findall(){
        //ApplicationContext as =new ClassPathXmlApplicationContext("bean.xml");
        //IAccountService ac=(IAccountService)as.getBean("accountService");

        Account account = new Account();
        account.setId(12);
        account.setMoney(896f);
        account.setName("yangxue");
        accountService.saveAccount(account);
        //int i=1/0;
    }

}
