package com.example.demoproject;

public class DataClass {
        private String updatedAt;
        private String name;
        private Object description;
        private String createdAt;
        private int id;
        private String deletedAt;

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setDescription(Object description) {
            this.description = description;
        }

        public Object getDescription() {
            return description;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void setDeletedAt(Object deletedAt) {
            this.deletedAt = (String) deletedAt;
        }

        public Object getDeletedAt() {
            return deletedAt;
        }

        public class Attribute {
            private Object storeId;
            private String updatedAt;
            private int display;
            private String name;
            private Object description;
            private String createdAt;
            private int attributeTypeId;
            private int id;
            private Object deletedAt;

            public void setStoreId(Object storeId) {
                this.storeId = storeId;
            }

            public Object getStoreId() {
                return storeId;
            }

            public void setUpdatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
            }

            public String getUpdatedAt() {
                return updatedAt;
            }

            public void setDisplay(int display) {
                this.display = display;
            }

            public int getDisplay() {
                return display;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }

            public void setDescription(Object description) {
                this.description = description;
            }

            public Object getDescription() {
                return description;
            }

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

            public String getCreatedAt() {
                return createdAt;
            }

            public void setAttributeTypeId(int attributeTypeId) {
                this.attributeTypeId = attributeTypeId;
            }

            public int getAttributeTypeId() {
                return attributeTypeId;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getId() {
                return id;
            }

            public void setDeletedAt(Object deletedAt) {
                this.deletedAt = deletedAt;
            }

            public Object getDeletedAt() {
                return deletedAt;
            }
        }
    }
