package info.developia.showltan.mapper

import info.developia.showltan.model.Movie
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Result
import org.apache.ibatis.annotations.Results
import org.apache.ibatis.annotations.Select

@Mapper
interface MovieMapper {

    @Select("select * from showltan.movies")
    @Results(
            @Result(property = "imdbId", column = "imdb_id")
    )
    List<Movie> getAll()

}
