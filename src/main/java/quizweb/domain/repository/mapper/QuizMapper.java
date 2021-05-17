package quizweb.domain.repository.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import quizweb.domain.repository.entity.Quiz;
import quizweb.domain.servrice.valueobject.SearchCondition;

@Mapper
public interface QuizMapper {
    List<Quiz> fetchFirstPage(@Param("searchCondition") SearchCondition searchCondition, @Param("fetchSize") int fetchSize);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to
     * the database table quiz
     *
     * @mbg.generated Sun May 16 03:04:49 UTC 2021
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to
     * the database table quiz
     *
     * @mbg.generated Sun May 16 03:04:49 UTC 2021
     */
    int insert(Quiz record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to
     * the database table quiz
     *
     * @mbg.generated Sun May 16 03:04:49 UTC 2021
     */
    int insertSelective(Quiz record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to
     * the database table quiz
     *
     * @mbg.generated Sun May 16 03:04:49 UTC 2021
     */
    Quiz selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to
     * the database table quiz
     *
     * @mbg.generated Sun May 16 03:04:49 UTC 2021
     */
    int updateByPrimaryKeySelective(Quiz record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to
     * the database table quiz
     *
     * @mbg.generated Sun May 16 03:04:49 UTC 2021
     */
    int updateByPrimaryKey(Quiz record);
}