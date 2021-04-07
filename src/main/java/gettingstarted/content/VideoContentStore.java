package gettingstarted.content;

import org.springframework.content.commons.repository.ContentStore;
import org.springframework.content.rest.StoreRestResource;

import java.util.UUID;

/**
 * @author Le Anh Tuan
 */
@StoreRestResource(path="files")
public interface VideoContentStore extends ContentStore<Video, UUID> {
}
