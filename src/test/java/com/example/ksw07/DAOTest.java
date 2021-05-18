package com.example.ksw07;

import com.example.ksw07.dao.MemberDAO;
import com.example.ksw07.dto.MemberDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest()
public class DAOTest {
    @Autowired
    private MemberDAO memberDAO;


    @Test
    public void getUserList()throws Exception{

        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setEmail("ksw@banana.com");
        memberDTO.setPwd("passwd");

        memberDAO.insertData(memberDTO);


        for(MemberDTO md : memberDAO.selectAll()){
            System.out.println(md.getEmail());
        }
    }
}
