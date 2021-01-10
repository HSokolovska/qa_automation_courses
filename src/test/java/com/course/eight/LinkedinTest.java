package com.course.eight;
import org.testng.annotations.Test;

public class LinkedinTest extends BaseTest{

    @Test
    public void linkedinTest (){
        LinkedinSignInPage.getPage();
        LinkedinSignInPage.enterEmail("Test");
        LinkedinSignInPage.enterPass("Test2");
        LinkedinSignInPage.pressAgreeAndJoin();




    }
}

