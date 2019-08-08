package companyx.orders.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
//@RequiredArgsConstructor
@Transactional
public class CustomerOrderService {

    protected void test(){

        System.out.println("START");
    }

}
