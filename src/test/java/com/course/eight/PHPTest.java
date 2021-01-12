package com.course.eight;

import org.testng.annotations.Test;

public class PHPTest extends BaseForPHPTravel{

    @Test
    public void PHPTest(){

        PHPTravel.getPage();
        PHPTravel.selectStore();
        PHPTravel.waitUntilElementVisible(PHPTravel.getMobileFromDropDownList(), 3);
        PHPTravel.selectMobile();
        PHPTravel.selectHybridCheckbox();
        PHPTravel.pressContinueBtn();
        PHPTravel.pressContinueShopping();
    }
}
