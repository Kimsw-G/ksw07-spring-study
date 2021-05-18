package com.example.ksw07.dao;

import com.example.ksw07.dto.MemberDTO;

import java.util.List;

public interface MemberDAO {


    public List<MemberDTO> selectAll();
    public void insertData(MemberDTO dt);
}
