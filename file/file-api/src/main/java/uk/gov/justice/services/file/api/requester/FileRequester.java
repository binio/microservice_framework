package uk.gov.justice.services.file.api.requester;

import java.util.Optional;

/**
 * Interface for downloading file from file service.
 */
public interface FileRequester {

    /**
     * Requests a file from the FileService.
     * @param fileId - the unique id of the file.
     * @param fileMimeType - mime-type of the file.
     * @param fileName - name of the file.
     * @return content of the file in byte[].
     */
    Optional<byte[]> request(final String fileId, final String fileMimeType, final String fileName);

}
