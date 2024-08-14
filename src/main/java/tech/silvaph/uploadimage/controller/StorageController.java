package tech.silvaph.uploadimage.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import tech.silvaph.uploadimage.service.StorageService;

import java.io.IOException;

@RestController
@RequestMapping("/images")
public class StorageController {

    private final StorageService storageService;

    public StorageController(StorageService storageService) {
        this.storageService = storageService;
    }

    @PostMapping
    public ResponseEntity<?> uploadImage(@RequestParam("image") MultipartFile file) throws IOException {
        String uploadImage = storageService.uploadImage(file);
        return ResponseEntity.ok().body(uploadImage);
    }

    @GetMapping("/{fileName}")
    public ResponseEntity<?> downloadImage(@PathVariable String fileName){
        byte[] image = storageService.downloadImage(fileName);
        return ResponseEntity.ok()
                .contentType(MediaType.valueOf("image/png"))
                .body(image);
    }


}
