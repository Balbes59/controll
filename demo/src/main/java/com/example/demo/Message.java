
package com.example.demo;

import java.time.LocalDateTime;

    public class Message {
        private Integer id;
        private String title;
        private Integer price;
        private String author;
        private String message;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;

        public Integer getId() {
            return id;
        }

        public Integer getPrice() {
            return price;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public String getMessage() {
            return message;
        }

        public LocalDateTime getCreatedAt() {
            return createdAt;
        }

        public LocalDateTime getUpdatedAt() {
            return updatedAt;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public void setCreatedAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
        }

        public void setUpdatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
        }
    }
