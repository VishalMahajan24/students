package com.service.studentsP.Repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.service.studentsP.Entity.Student;

public interface Repository extends JpaRepository<Student, Integer> {
	
	@Query("SELECT new com.service.studentsP.Entity.Student(s.rollNo,s.studentName,s.studentGender,s.studentAge,s.collegeName) FROM Student s WHERE college_name='COEP' ORDER BY student_age DESC")
      public List<Student> getCOEP();
	
	@Query("SELECT new com.service.studentsP.Entity.Student(s.rollNo,s.studentName,s.studentGender,s.studentAge,s.collegeName) FROM Student s WHERE college_name='PICT' ORDER BY student_age DESC")
    public List<Student> getPICT();
	
	@Query("SELECT new com.service.studentsP.Entity.Student(s.rollNo,s.studentName,s.studentGender,s.studentAge,s.collegeName) FROM Student s WHERE college_name='TKIET' ORDER BY student_age DESC")
    public List<Student> getTKIET();
	
	@Query("SELECT new com.service.studentsP.Entity.Student(s.rollNo,s.studentName,s.studentGender,s.studentAge,s.collegeName) FROM Student s WHERE college_name='IIT' ORDER BY student_age DESC")
    public List<Student> getIIT();
	
	@Query("SELECT new com.service.studentsP.Entity.Student(s.rollNo,s.studentName,s.studentGender,s.studentAge,s.collegeName) FROM Student s  ORDER BY student_name ASC")
    public List<Student> getAllst();

}
