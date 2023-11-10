CREATE TABLE customer(Name VARCHAR(20) NOT NULL,
PhoneNumber VARCHAR(10) PRIMARY KEY,
                      Pass VARCHAR(20) NOT NULL,
                      Email VARCHAR(40) NOT NULL,
                      Bdate date NOT NULL,
                      city VARCHAR(20),
                      ZIPCode INT,
                      AddNum INT);

 
CREATE TABLE Admin(Name VARCHAR(20) NOT NULL,
      PhoneNumber VARCHAR(10) PRIMARY KEY,
                      Pass VARCHAR(20) NOT NULL,
                      Email VARCHAR(40) NOT NULL,
                      Bdate date NOT NULL);
 
CREATE TABLE Artist(Name VARCHAR(20) NOT NULL,
      PhoneNumber VARCHAR(10) PRIMARY KEY,
                      Pass VARCHAR(20) NOT NULL,
                      Email VARCHAR(40) NOT NULL,
                      Bdate date NOT NULL,
                      typeOfArt VARCHAR(20),
                      UserName VARCHAR(20) NOT NULL,
                      UNIQUE(UserName));
 
CREATE TABLE TOrder(ID INT  NOT NULL GENERATED ALWAYS AS IDENTITY,
    PhoneNumber VARCHAR(10) NOT NULL,
                      Quantity INT ,
                      Price DOUBLE,
                      orderDate date NOT NULL,
                      PRIMARY KEY(ID, PhoneNumber ),
                      FOREIGN KEY(PhoneNumber)REFERENCES customer(PhoneNumber) );
 
CREATE TABLE sculpture(ArtName VARCHAR(25)  NOT NULL,
 PhoneNumber VARCHAR(10) NOT NULL,
                      Quantity INT ,
                      Price DOUBLE,
                      madeYear INT NOT NULL,
                      Description VARCHAR(100),
                      material VARCHAR(25),
                      PRIMARY KEY(ArtName,PhoneNumber),
                      FOREIGN KEY(PhoneNumber)REFERENCES artist(PhoneNumber) );

Alter table SCULPTURE
DROP CONSTRAINT SQL210330171618191;
 
Alter table SCULPTURE
ADD CONSTRAINT ARTISTTPHONE_S FOREIGN KEY(PHONENUMBER) REFERENCES ARTIST(PHONENUMBER)
ON DELETE CASCADE;  
 
CREATE TABLE paint(ArtName VARCHAR(25)  NOT NULL,
 PhoneNumber VARCHAR(10) NOT NULL,
                      Quantity INT ,
                      Price DOUBLE,
                      madeYear INT NOT NULL,
                      Description VARCHAR(100),
                      colorType VARCHAR(15),
                      width DOUBLE,
                      hieght DOUBLE,
                      PRIMARY KEY(ArtName,PhoneNumber),
                      FOREIGN KEY(PhoneNumber)REFERENCES artist(PhoneNumber) );

Alter table PAINT
DROP CONSTRAINT SQL210330172000161;
 
Alter table PAINT
ADD CONSTRAINT ARTISTTPHONE FOREIGN KEY(PHONENUMBER) REFERENCES ARTIST(PHONENUMBER)
ON DELETE CASCADE;
 
CREATE TABLE OrderArt(custPhoneNumber VARCHAR(10) NOT NULL,
                      ID INT NOT NULL,
                      ArtistPhoneNumber VARCHAR(10) NOT NULL,
                      ArtName VARCHAR(25) NOT NULL,
                      FOREIGN KEY(ArtistPhoneNumber)REFERENCES artist(PhoneNumber),
                      FOREIGN KEY(ID,CustPhoneNumber)REFERENCES torder(ID,PhoneNumber),
                      PRIMARY KEY(ArtName,CustPhoneNumber,ArtistPhoneNumber,ID)
                      );
