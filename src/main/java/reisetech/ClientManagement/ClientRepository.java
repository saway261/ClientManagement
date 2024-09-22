package reisetech.ClientManagement;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface ClientRepository {

  @Select("SELECT * FROM client WHERE name = #{name}")
  Client selectByName(String name);

  @Select("SELECT MAX(id) FROM client")
  Integer selectMaxId();

  @Select("SELECT * FROM client WHERE id = #{id}")
  Client selectById(int id);

  @Insert("INSERT INTO client (name, age) VALUES (#{name}, #{age})")
  void createClient(String name, int age);

  @Update("UPDATE client SET age = #{age} WHERE name = #{name}")
  void updateClient(String name, int age);

  @Delete("DELETE FROM client WHERE name = #{name}")
  void deleteClient(String name);


}
