package gettingstarted.content;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.content.commons.annotations.ContentId;
import org.springframework.content.commons.annotations.ContentLength;
import org.springframework.content.commons.annotations.MimeType;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

/**
 * @author Le Anh Tuan
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    // new
    private String name;
    private String summary;
    private Date created = new Date();
    // new

    private String originalName;

    private String extension;

    @MimeType
    private String mimeType;

    @ContentId
    private UUID contentId;

    @ContentLength
    private long contentLength;

    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime lastModifiedDate;
}
