package codingbat;

import codingbat.service.Impl.CodingBatServiceImpl;
import codingbat.service.Impl.DemoService;


public class CodingBatMain {
    public static void main(String[] args) {
        DemoService demoService = new DemoService();
        demoService.run();
    }
}
