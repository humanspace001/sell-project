package kg.itschool.sellservice;

import kg.itschool.sellservice.models.dtos.user.UserCreateDTO;
import kg.itschool.sellservice.services.CodeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SellServiceApplicationTests {
    @Autowired
    CodeService codeService;
    UserCreateDTO codeResponse;
    @Test
    void contextLoads(CodeService codeService) {
        codeService.sendCode(codeResponse);
        

    }

}
