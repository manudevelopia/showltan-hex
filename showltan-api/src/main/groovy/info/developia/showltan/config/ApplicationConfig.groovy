package info.developia.showltan.config

import info.developia.showltan.repository.MovieRepositoryImpl
import info.developia.showltan.mapper.MovieMapper
import info.developia.showltan.repository.MovieRepository
import info.developia.showltan.service.MovieService
import info.developia.showltan.service.MovieServiceImpl
import org.mybatis.spring.annotation.MapperScan
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
@MapperScan("info.developia.showltan.mapper")
class ApplicationConfig {

    @Autowired
    private final MovieMapper movieMapper

    @Bean
    public MovieService getComposeService() {
        return new MovieServiceImpl(composeRepository)
    }

    @Bean
    public MovieRepository getComposeRepository() {
        return new MovieRepositoryImpl(movieMapper)
    }

}
