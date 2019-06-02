package kea.botxo.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import kea.botxo.models.HttpRequestType;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@Repository
public class ReHttpRequestType {

    @Autowired
    JdbcTemplate template;

    /**
     *
     * @return
     */
    public List<HttpRequestType> fetchAll() {

      String sql = "SELECT * FROM http_request_types";
      RowMapper<HttpRequestType> rowMapper = new BeanPropertyRowMapper<>(HttpRequestType.class);
      return template.query(sql, rowMapper);
    }

    /**
     *
     * @param h
     * @return
     */
    public boolean delete(String h) {
      String sql = "DELETE FROM http_request_types WHERE http_request_type=?";
      return ( template.update(sql, h) != 0 );
    }

    /**
     *
     * @param h
     * @return
     */
    public boolean add(String h) {
      return true;
    }
  
}
