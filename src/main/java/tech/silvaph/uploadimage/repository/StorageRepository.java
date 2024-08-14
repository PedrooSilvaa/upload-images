package tech.silvaph.uploadimage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.silvaph.uploadimage.entity.ImageData;

import java.util.Optional;

public interface StorageRepository extends JpaRepository<ImageData, Long> {
    Optional<ImageData> findByName(String fileName);
}
