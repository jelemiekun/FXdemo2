package com.example.fxdemo2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.security.Key;

public class Scene1Controller {

    @FXML
    private AnchorPane mainPane;

    @FXML
    private Button btnCenter;

    @FXML
    private Button btnChangePhoto;

    @FXML
    private Button btnDown;

    @FXML
    private Button btnDownLeft;

    @FXML
    private Button btnDownRight;

    @FXML
    private Button btnLeft;

    @FXML
    private Button btnRight;

    @FXML
    private Button btnRotateLeft;

    @FXML
    private Button btnRotateRight;

    @FXML
    private Button btnUp;

    @FXML
    private Button btnUpLeft;

    @FXML
    private Button btnUpRight;

    @FXML
    private ImageView img;

    @FXML
    private Label positionX;

    @FXML
    private Label positionY;

    @FXML
    private Label rotationR;

    private int x;
    private int y;

    private boolean picture;

    Image image1 = new Image(getClass().getResourceAsStream("/com/example/fxdemo2/Media/photo1.jpg"));
    Image image2 = new Image(getClass().getResourceAsStream("/com/example/fxdemo2/Media/photo2.jpg"));


    @FXML
    void btnCenterClicked() {
        img.setLayoutX(145);
        img.setLayoutY(125);
        x = 0;
        y = 0;
        positionX.setText(String.valueOf(x));
        positionY.setText(String.valueOf(y));
    }

    @FXML
    void btnDownClicked() {
        img.setLayoutY(img.getLayoutY() + 5);
        y -= 5;
        positionY.setText(String.valueOf(y));
    }

    @FXML
    void btnDownLeftClicked() {
        img.setLayoutX(img.getLayoutX() - 5);
        img.setLayoutY(img.getLayoutY() + 5);
        x -= 5;
        y -= 5;
        positionX.setText(String.valueOf(x));
        positionY.setText(String.valueOf(y));
    }

    @FXML
    void btnDownRightClicked() {
        img.setLayoutX(img.getLayoutX() + 5);
        img.setLayoutY(img.getLayoutY() + 5);
        x += 5;
        y -= 5;
        positionX.setText(String.valueOf(x));
        positionY.setText(String.valueOf(y));
    }

    @FXML
    void btnLeftClicked() {
        img.setLayoutX(img.getLayoutX() - 5);
        x -= 5;
        positionX.setText(String.valueOf(x));
    }

    @FXML
    void btnRightClicked() {
        img.setLayoutX(img.getLayoutX() + 5);
        x += 5;
        positionX.setText(String.valueOf(x));
    }

    @FXML
    void btnUpClicked() {
        img.setLayoutY(img.getLayoutY() - 5);
        y += 5;
        positionY.setText(String.valueOf(y));
    }

    @FXML
    void btnUpLeftClicked() {
        img.setLayoutX(img.getLayoutX() - 5);
        img.setLayoutY(img.getLayoutY() - 5);
        x -= 5;
        y += 5;
        positionX.setText(String.valueOf(x));
        positionY.setText(String.valueOf(y));
    }

    @FXML
    void btnUpRightClicked() {
        img.setLayoutX(img.getLayoutX() + 5);
        img.setLayoutY(img.getLayoutY() - 5);
        x += 5;
        y += 5;
        positionX.setText(String.valueOf(x));
        positionY.setText(String.valueOf(y));
    }

    @FXML
    void btnChangePhotoClicked() {
        if (picture) {
            btnChangePhoto.setText("CHANGE TO PHOTO 2");
            img.setImage(image1);
            picture = false;
        } else {
            btnChangePhoto.setText("CHANGE TO PHOTO 1");
            img.setImage(image2);
            picture = true;
        }
    }

    @FXML
    void btnRotateLeftClicked() {
        img.setRotate(img.getRotate() - 5);
        rotationR.setText(String.valueOf(img.getRotate()));
    }

    @FXML
    void btnRotateRightClicked() {
        img.setRotate(img.getRotate() + 5);
        rotationR.setText(String.valueOf(img.getRotate()));
    }

    @FXML
    void btnKeysPressed(KeyEvent event) {
        if (event.getCode() == KeyCode.W)
            btnUpClicked();
        else if (event.getCode() == KeyCode.W && event.getCode() == KeyCode.D)
            btnUpRightClicked();
        else if (event.getCode() == KeyCode.D)
            btnRightClicked();
        else if (event.getCode() == KeyCode.D && event.getCode() == KeyCode.S)
            btnDownRightClicked();
        else if (event.getCode() == KeyCode.S)
            btnDownClicked();
        else if (event.getCode() == KeyCode.S && event.getCode() == KeyCode.A)
            btnDownLeftClicked();
        else if (event.getCode() == KeyCode.A)
            btnLeftClicked();
        else if (event.getCode() == KeyCode.A && event.getCode() == KeyCode.W)
            btnUpLeftClicked();

        if (event.getCode() == KeyCode.Q)
            btnRotateLeftClicked();
        else if (event.getCode() == KeyCode.E)
            btnRotateRightClicked();

        if (event.getCode() == KeyCode.SPACE)
            btnChangePhotoClicked();
    }
}
