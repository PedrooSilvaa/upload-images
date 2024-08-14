package tech.silvaph.uploadimage.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import tech.silvaph.uploadimage.entity.ImageData;
import tech.silvaph.uploadimage.repository.StorageRepository;
import tech.silvaph.uploadimage.util.ImageUtils;

import javax.swing.text.html.Option;
import java.io.IOException;
import java.util.Optional;

@Service
public class StorageService {

    private final StorageRepository storageRepository;

    public StorageService(StorageRepository storageRepository) {
        this.storageRepository = storageRepository;
    }

    public String uploadImage(MultipartFile file) throws IOException {
        ImageData imageData = storageRepository.save(new ImageData.Builder()
                .name(file.getOriginalFilename())
                .type(file.getContentType())
                .imageData(ImageUtils.compressImage(file.getBytes()))
                .build());
        if (imageData != null){
            return "file uploaded sucessfully " + file.getOriginalFilename();
        }
        return null;
    }

    public byte[] downloadImage(String fileName){
        Optional<ImageData> dbImageData = storageRepository.findByName(fileName);
        byte[] images = ImageUtils.decompressImage(dbImageData.get().getImageData());
        return images;
    }
}
