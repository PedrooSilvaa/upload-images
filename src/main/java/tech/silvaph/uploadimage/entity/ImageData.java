package tech.silvaph.uploadimage.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ImageData")
public class ImageData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String type;

    @Lob
    @Column(name = "imageData", length = 1000)
    private byte[] imageData;

    public ImageData(Long id, String name, String type, byte[] imageData) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.imageData = imageData;
    }

    private ImageData(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.type = builder.type;
        this.imageData = builder.imageData;
    }

    public ImageData() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public byte[] getImageData() {
        return imageData;
    }

    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }


    public static class Builder {
        private Long id;
        private String name;
        private String type;
        private byte[] imageData;

        // Métodos do Builder
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder imageData(byte[] imageData) {
            this.imageData = imageData;
            return this;
        }

        public ImageData build() {
            return new ImageData(this);
        }
    }
}

