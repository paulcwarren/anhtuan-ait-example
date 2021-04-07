package gettingstarted.content;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

/**
 * @author Le Anh Tuan
 */
@RepositoryRestResource(path="files", collectionResourceRel="files")
public interface VideoRepository extends JpaRepository<Video, UUID> {

}
