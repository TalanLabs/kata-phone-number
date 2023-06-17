package com.talan.dojo.phonenumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    @DisplayName("one simple number")
    void oneSimpleNumber() {
        String[] phoneNumbers = new String[]{"0467123456"};
        int countNodes = Solution.countNodes(phoneNumbers);
        Assertions.assertEquals(10, countNodes);
    }

    @Test
    @DisplayName("without common base")
    void withoutCommonBase() {
        String[] phoneNumbers = new String[]{"0123456789", "1123456789"};
        int countNodes = Solution.countNodes(phoneNumbers);
        Assertions.assertEquals(20, countNodes);
    }

    @Test
    @DisplayName("include phone number")
    void includePhoneNumber() {
        String[] phoneNumbers = new String[]{"0123456789", "0123"};
        int countNodes = Solution.countNodes(phoneNumbers);
        Assertions.assertEquals(10, countNodes);
    }

    @Test
    @DisplayName("with common base")
    void withCommonBase() {
        String[] phoneNumbers = new String[]{
                "0412578440",
                "0412199803",
                "0468892011",
                "112",
                "15"
        };
        int countNodes = Solution.countNodes(phoneNumbers);
        Assertions.assertEquals(28, countNodes);
    }

    @Test
    @DisplayName("a big list")
    void aBigList() {
        String[] phoneNumbers = new String[]{
                "10000",
                "2980950684",
                "5047459100",
                "3811658223",
                "6951565505",
                "0200306553",
                "4924502386",
                "59278",
                "633",
                "776524",
                "9967765390",
                "8044781997",
                "1892478193",
                "28214",
                "3855270610",
                "1130326923",
                "9809183034",
                "820100",
                "8885"
        };
        int countNodes = Solution.countNodes(phoneNumbers);
        Assertions.assertEquals(28, countNodes);
    }
}
