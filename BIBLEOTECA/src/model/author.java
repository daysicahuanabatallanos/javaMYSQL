package model;

import java.util.Date;

public class author {


    public class Author {

        // Atributos privados
        private int idAuthor;
        private String name;
        private String firstName;
        private String lastName;
        private String email;
        private String phone;
        private Date createAt;
        private java.sql.Date updateAt;

        public Author(int idAuthor, String name, String firstName, String lastName, String email, String phone, Date createAt, java.sql.Date updateAt) {
            this.idAuthor = idAuthor;
            this.name = name;
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.phone = phone;
            this.createAt = createAt;
            this.updateAt = updateAt;
        }

        public int getIdAuthor() {
            return idAuthor;
        }

        public void setIdAuthor(int idAuthor) {
            this.idAuthor = idAuthor;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public Date getCreateAt() {
            return createAt;
        }

        public void setCreateAt(Date createAt) {
            this.createAt = createAt;
        }

        public java.sql.Date getUpdateAt() {
            return updateAt;
        }

        public void setUpdateAt(java.sql.Date updateAt) {
            this.updateAt = updateAt;
        }
    }
}
