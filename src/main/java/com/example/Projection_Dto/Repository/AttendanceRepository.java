package com.example.Projection_Dto.Repository;

import com.example.Projection_Dto.DTO.AttenndanceDto;
import com.example.Projection_Dto.Entity.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance,Integer> {

    @Query("select new com.example.Projection_Dto.DTO.AttenndanceDto(t.id, t.name) from Attendance t where t.name = :name")
    AttenndanceDto getByName(String name);

    @Query("select new com.example.Projection_Dto.DTO.AttenndanceDto(t.id, t.name) from Attendance t where t.id =?1")
    AttenndanceDto getById(int id);
}
