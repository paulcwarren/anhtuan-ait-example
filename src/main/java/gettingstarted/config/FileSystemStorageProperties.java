package gettingstarted.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.stereotype.Component;


@Getter
@AllArgsConstructor
@ConstructorBinding
@ConfigurationProperties(prefix = "content.fs")
/**
 * Properties of this class are immutable.
 * @author Le Anh Tuan
 */
public class FileSystemStorageProperties {

    private final String filesystemRoot;

    private String videoPath;

    private String classManagementDataPath;

    private String programSubmissionDataPath;
}
