package sample;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main extends Application {
 public Scene EntryScene,MainMenuScene,SummaryReportScene,DetailsReportScene,ExceptionReportScene;
 public Stage window;


    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("Trucking Main Menu");
        setUpEntryScene();
        setUpMainMenu();
       setUpDetailsScene();
      //  setUpSummaryScene();
      //  setUpExceptionScene();
        window.setScene(MainMenuScene);
        window.show();

    }
public void setUpMainMenu()
{

    Menu truckMenu = new Menu("_Main Menu");
    MenuItem mainMenu= new MenuItem("Truck Menu...");
    truckMenu.getItems().add(mainMenu);
    mainMenu.setOnAction(e -> window.setScene(MainMenuScene));

    Menu entryMenu = new Menu("_Entry Page");
    MenuItem entryMenuItem= new MenuItem("Entry Page...");
    entryMenu.getItems().add(entryMenuItem);
    entryMenuItem.setOnAction(e -> window.setScene(EntryScene));

    BorderPane layout = new BorderPane();

    Menu ReportsMenu = new Menu("Reports");
    MenuItem ExceptionReport= new MenuItem("Exception Report...");
    MenuItem DetailsReport= new MenuItem("Details Report...");
    MenuItem SummaryReport= new MenuItem("Summary Report...");
    ReportsMenu.getItems().add(ExceptionReport);
    ReportsMenu.getItems().add(DetailsReport);
    ReportsMenu.getItems().add(SummaryReport);
    ExceptionReport.setOnAction(e -> window.setScene(ExceptionReportScene));
    DetailsReport.setOnAction(e -> window.setScene(DetailsReportScene));
    SummaryReport.setOnAction(e -> window.setScene(SummaryReportScene));

    MenuBar menuBar = new MenuBar();
    menuBar.getMenus().addAll(truckMenu,entryMenu,ReportsMenu);

    layout.setTop(menuBar);
    Label welcome = new Label("      Welcome To Trucker application");
    Label welcome2 = new Label(" ");
    Label welcome3 = new Label(" ");
    Label welcome4 = new Label(" ");
    Label welcome5 = new Label(" ");

    HBox hbox =  new HBox(30,menuBar);
    HBox hbox2 =  new HBox(30,welcome);
    VBox vbox = new VBox(hbox,welcome2,welcome3,hbox2,welcome4,welcome5);
    MainMenuScene = new Scene(vbox);
}
public void setUpDetailsScene()
{
    List<Trucker> truckerList = null;
    DBHandler db = new DBHandler();
    try {
        truckerList = db.getTruckers();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
   }
    catch (SQLException e) {
        e.printStackTrace();
    }
    ScrollPane scrollPane = new ScrollPane();
    VBox vbox ;
    Menu truckMenu = new Menu("_Main Menu");
    MenuItem mainMenu= new MenuItem("Truck Menu...");
    truckMenu.getItems().add(mainMenu);
    mainMenu.setOnAction(e -> window.setScene(MainMenuScene));

    Menu entryMenu = new Menu("_Entry Page");
    MenuItem entryMenuItem= new MenuItem("Entry Page...");
    entryMenu.getItems().add(entryMenuItem);
    entryMenuItem.setOnAction(e -> window.setScene(EntryScene));

    BorderPane layout = new BorderPane();

    Menu ReportsMenu = new Menu("Reports");
    MenuItem ExceptionReport= new MenuItem("Exception Report...");
    MenuItem DetailsReport= new MenuItem("Details Report...");
    MenuItem SummaryReport= new MenuItem("Summary Report...");
    ReportsMenu.getItems().add(ExceptionReport);
    ReportsMenu.getItems().add(DetailsReport);
    ReportsMenu.getItems().add(SummaryReport);
    ExceptionReport.setOnAction(e -> window.setScene(ExceptionReportScene));
    DetailsReport.setOnAction(e -> window.setScene(DetailsReportScene));
    SummaryReport.setOnAction(e -> window.setScene(SummaryReportScene));

    MenuBar menuBar = new MenuBar();
    menuBar.getMenus().addAll(truckMenu,entryMenu,ReportsMenu);

    layout.setTop(menuBar);
vbox= new VBox(layout);


    for(Trucker tr : truckerList)
    {

        Label name1 = new Label(" Truck Number: ");
        Label value1 = new Label(tr.getTruck_number() + "");
        HBox hbox1= new HBox(name1,value1);

        Label name2 = new Label(" Driver Number: ");
        Label value2 = new Label(tr.getDriver_number() + "");
        HBox hbox2= new HBox(name2,value2);

        Label name14 = new Label(" Trip Number: ");
        Label value14 = new Label(tr.getTrip_number() + "");
        HBox hbox14= new HBox(name14,value14);

        Label name3 = new Label("Co Driver Number: ");
        Label value3 = new Label(tr.getCo_driver_number() + "");
        HBox hbox3= new HBox(name3,value3);



        Label name4 = new Label(" Date Departed: ");
        Label value4 = new Label(tr.getDate_departed() + "");
        HBox hbox4= new HBox(name4,value4);




        Label name5 = new Label(" Date returned: ");
        Label value5 = new Label(tr.getDate_returned() + "");
        HBox hbox5= new HBox(name5,value5);




        Label name6 = new Label("State Code: ");
        Label value6 = new Label(tr.getState_code() + "");
        HBox hbox6= new HBox(name6,value6);


        Label name7 = new Label(" Miles Driven: ");
        Label value7 = new Label(tr.getMiles_driven() + "");
        HBox hbox7= new HBox(name7,value7);


        Label name8 = new Label(" Fuel Receipt : ");
        Label value8= new Label(tr.getFuel_receipt_number() + "");
        HBox hbox8= new HBox(name8,value8);

        Label name9 = new Label(" Gallons Purchased ");
        Label value9 = new Label(tr.getGallons_purchased() + "");
        HBox hbox9= new HBox(name9,value9);


        Label name10 = new Label(" Taxes Paid: ");
        Label value10 = new Label(tr.getTaxes_paid() + "");
        HBox hbox10= new HBox(name10,value10);


        Label name11 = new Label("Station Name: ");
        Label value11 = new Label(tr.getDriver_number() + "");
        HBox hbox11= new HBox(name11,value11);



        Label name12 = new Label("Station Street: ");
        Label value12 = new Label(tr.getStation_street_location()+ "");
        HBox hbox12= new HBox(name12,value12);



        Label name13 = new Label(" Station City: ");
        Label value13 = new Label(tr.getStation_city_location() + "");
        HBox hbox13= new HBox(name13,value13);

        Label name15 = new Label(" ---------------------------------------- ");

        vbox.getChildren().addAll(hbox1,hbox2,hbox3,hbox14,
                hbox4,hbox5,hbox6,hbox7,hbox8,hbox9,hbox10,hbox11,hbox12,hbox13,name15);
    }





scrollPane.setContent(vbox);

    DetailsReportScene = new Scene(scrollPane);
}

    public void setUpSummaryScene()
    {
        List<Trucker> truckerList = null;
        DBHandler db = new DBHandler();
        try {
            truckerList = db.getTruckers();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ScrollPane scrollPane = new ScrollPane();
        VBox vbox ;
        Menu truckMenu = new Menu("_Main Menu");
        MenuItem mainMenu= new MenuItem("Truck Menu...");
        truckMenu.getItems().add(mainMenu);
        mainMenu.setOnAction(e -> window.setScene(MainMenuScene));

        Menu entryMenu = new Menu("_Entry Page");
        MenuItem entryMenuItem= new MenuItem("Entry Page...");
        entryMenu.getItems().add(entryMenuItem);
        entryMenuItem.setOnAction(e -> window.setScene(EntryScene));

        BorderPane layout = new BorderPane();

        Menu ReportsMenu = new Menu("Reports");
        MenuItem ExceptionReport= new MenuItem("Exception Report...");
        MenuItem DetailsReport= new MenuItem("Details Report...");
        MenuItem SummaryReport= new MenuItem("Summary Report...");
        ReportsMenu.getItems().add(ExceptionReport);
        ReportsMenu.getItems().add(DetailsReport);
        ReportsMenu.getItems().add(SummaryReport);
        ExceptionReport.setOnAction(e -> window.setScene(ExceptionReportScene));
        DetailsReport.setOnAction(e -> window.setScene(DetailsReportScene));
        SummaryReport.setOnAction(e -> window.setScene(SummaryReportScene));

        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(truckMenu,entryMenu,ReportsMenu);
        String states = "";
        int miles = 0;
        int totalG = 0;
        int totalT = 0;
        for(Trucker tr : truckerList)
        {
            states +=" " + tr.getState_code();
            miles += tr.getMiles_driven();
            totalG += tr.getGallons_purchased();
            totalT += tr.getTaxes_paid();
        }

        Label name6 = new Label("State Codes: ");
        Label value6 = new Label(states + "");
        HBox hbox6= new HBox(name6,value6);


        Label name7 = new Label(" Miles Driven: ");
        Label value7 = new Label(miles + "");
        HBox hbox7= new HBox(name7,value7);



        Label name9 = new Label(" Gallons Purchased ");
        Label value9 = new Label(totalG + "");
        HBox hbox9= new HBox(name9,value9);


        Label name10 = new Label(" Taxes Paid: ");
        Label value10 = new Label(totalT + "");
        HBox hbox10= new HBox(name10,value10);
        layout.setTop(menuBar);
        vbox= new VBox(layout,hbox6,hbox7,hbox9,hbox10);



        scrollPane.setContent(vbox);

        SummaryReportScene = new Scene(scrollPane,300,400);
    }
    public void setUpExceptionScene()
    {

        ScrollPane scrollPane = new ScrollPane();
        VBox vbox ;
        Menu truckMenu = new Menu("_Main Menu");
        MenuItem mainMenu= new MenuItem("Truck Menu...");
        truckMenu.getItems().add(mainMenu);
        mainMenu.setOnAction(e -> window.setScene(MainMenuScene));

        Menu entryMenu = new Menu("_Entry Page");
        MenuItem entryMenuItem= new MenuItem("Entry Page...");
        entryMenu.getItems().add(entryMenuItem);
        entryMenuItem.setOnAction(e -> window.setScene(EntryScene));

        BorderPane layout = new BorderPane();

        Menu ReportsMenu = new Menu("Reports");
        MenuItem ExceptionReport= new MenuItem("Exception Report...");
        MenuItem DetailsReport= new MenuItem("Details Report...");
        MenuItem SummaryReport= new MenuItem("Summary Report...");
        ReportsMenu.getItems().add(ExceptionReport);
        ReportsMenu.getItems().add(DetailsReport);
        ReportsMenu.getItems().add(SummaryReport);
        ExceptionReport.setOnAction(e -> window.setScene(ExceptionReportScene));
        DetailsReport.setOnAction(e -> window.setScene(DetailsReportScene));
        SummaryReport.setOnAction(e -> window.setScene(SummaryReportScene));

        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(truckMenu,entryMenu,ReportsMenu);

        layout.setTop(menuBar);
        vbox= new VBox(layout);


        List<Trucker> truckerList = null;
        DBHandler db = new DBHandler();
        try {
            truckerList = db.getTruckers();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        Button sinisterButton = new Button ("Submit");

        Label condition = new Label("Condition:");
        TextField conditionField = new TextField();
        HBox conditionHbox = new HBox(condition,conditionField);

        Label nameValue = new Label("Value:");
        TextField nameValueField = new TextField();
        HBox nameValueHbox = new HBox(nameValue,nameValueField);

vbox.getChildren().addAll(conditionHbox,nameValueHbox);
final VBox [] vb = {vbox};
        final HBox [] hb = {conditionHbox,nameValueHbox};

        sinisterButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                 List<Trucker> finalTruckerList = null;

            DBHandler df = new DBHandler();
            try {
               finalTruckerList = df.getTruckers(condition.getText(),nameValueField.getText());
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            condition.setText("");
            nameValueField.setText("");
            vb [1] = null;
vb[1].getChildren().addAll(hb[0],hb[1]);
            for(Trucker tr : finalTruckerList)
            {

                Label name1 = new Label(" Truck Number: ");
                Label value1 = new Label(tr.getTruck_number() + "");
                HBox hbox1= new HBox(name1,value1);

                Label name2 = new Label(" Driver Number: ");
                Label value2 = new Label(tr.getDriver_number() + "");
                HBox hbox2= new HBox(name2,value2);

                Label name14 = new Label(" Trip Number: ");
                Label value14 = new Label(tr.getTrip_number() + "");
                HBox hbox14= new HBox(name14,value14);

                Label name3 = new Label("Co Driver Number: ");
                Label value3 = new Label(tr.getCo_driver_number() + "");
                HBox hbox3= new HBox(name3,value3);



                Label name4 = new Label(" Date Departed: ");
                Label value4 = new Label(tr.getDate_departed() + "");
                HBox hbox4= new HBox(name4,value4);




                Label name5 = new Label(" Date returned: ");
                Label value5 = new Label(tr.getDate_returned() + "");
                HBox hbox5= new HBox(name5,value5);




                Label name6 = new Label("State Code: ");
                Label value6 = new Label(tr.getState_code() + "");
                HBox hbox6= new HBox(name6,value6);


                Label name7 = new Label(" Miles Driven: ");
                Label value7 = new Label(tr.getMiles_driven() + "");
                HBox hbox7= new HBox(name2,value2);


                Label name8 = new Label(" Fuel Receipt : ");
                Label value8= new Label(tr.getFuel_receipt_number() + "");
                HBox hbox8= new HBox(name8,value8);

                Label name9 = new Label(" Gallons Purchased ");
                Label value9 = new Label(tr.getGallons_purchased() + "");
                HBox hbox9= new HBox(name9,value9);


                Label name10 = new Label(" Taxes Paid: ");
                Label value10 = new Label(tr.getTaxes_paid() + "");
                HBox hbox10= new HBox(name10,value10);


                Label name11 = new Label("Station Name: ");
                Label value11 = new Label(tr.getDriver_number() + "");
                HBox hbox11= new HBox(name11,value11);



                Label name12 = new Label("Station Street: ");
                Label value12 = new Label(tr.getStation_street_location()+ "");
                HBox hbox12= new HBox(name12,value12);



                Label name13 = new Label(" Station City: ");
                Label value13 = new Label(tr.getStation_city_location() + "");
                HBox hbox13= new HBox(name13,value13);

                Label name15 = new Label(" ---------------------------------------- ");

                vb[1].getChildren().addAll(hbox1,hbox2,hbox3,hbox14,
                        hbox4,hbox5,hbox6,hbox7,hbox8,hbox9,hbox10,hbox11,hbox12,hbox13,name15);


            }





            scrollPane.setContent(vbox);

            ExceptionReportScene = new Scene(scrollPane);
        }});


        for(Trucker tr : truckerList)
        {

            Label name1 = new Label(" Truck Number: ");
            Label value1 = new Label(tr.getTruck_number() + "");
            HBox hbox1= new HBox(name1,value1);

            Label name2 = new Label(" Driver Number: ");
            Label value2 = new Label(tr.getDriver_number() + "");
            HBox hbox2= new HBox(name2,value2);

            Label name14 = new Label(" Trip Number: ");
            Label value14 = new Label(tr.getTrip_number() + "");
            HBox hbox14= new HBox(name14,value14);

            Label name3 = new Label("Co Driver Number: ");
            Label value3 = new Label(tr.getCo_driver_number() + "");
            HBox hbox3= new HBox(name3,value3);



            Label name4 = new Label(" Date Departed: ");
            Label value4 = new Label(tr.getDate_departed() + "");
            HBox hbox4= new HBox(name4,value4);




            Label name5 = new Label(" Date returned: ");
            Label value5 = new Label(tr.getDate_returned() + "");
            HBox hbox5= new HBox(name5,value5);




            Label name6 = new Label("State Code: ");
            Label value6 = new Label(tr.getState_code() + "");
            HBox hbox6= new HBox(name6,value6);


            Label name7 = new Label(" Miles Driven: ");
            Label value7 = new Label(tr.getMiles_driven() + "");
            HBox hbox7= new HBox(name7,value7);


            Label name8 = new Label(" Fuel Receipt : ");
            Label value8= new Label(tr.getFuel_receipt_number() + "");
            HBox hbox8= new HBox(name8,value8);

            Label name9 = new Label(" Gallons Purchased ");
            Label value9 = new Label(tr.getGallons_purchased() + "");
            HBox hbox9= new HBox(name9,value9);


            Label name10 = new Label(" Taxes Paid: ");
            Label value10 = new Label(tr.getTaxes_paid() + "");
            HBox hbox10= new HBox(name10,value10);


            Label name11 = new Label("Station Name: ");
            Label value11 = new Label(tr.getDriver_number() + "");
            HBox hbox11= new HBox(name11,value11);



            Label name12 = new Label("Station Street: ");
            Label value12 = new Label(tr.getStation_street_location()+ "");
            HBox hbox12= new HBox(name12,value12);



            Label name13 = new Label(" Station City: ");
            Label value13 = new Label(tr.getStation_city_location() + "");
            HBox hbox13= new HBox(name13,value13);

            Label name15 = new Label(" ---------------------------------------- ");

            vbox.getChildren().addAll(hbox1,hbox2,hbox3,hbox14,
                    hbox4,hbox5,hbox6,hbox7,hbox8,hbox9,hbox10,hbox11,hbox12,hbox13,name15);


        }





        scrollPane.setContent(vbox);

       ExceptionReportScene = new Scene(scrollPane);
    }



    public void setUpEntryScene()
    {

        Button sinisterButton = new Button ("Submit");

        Label truckNumberLabel = new Label("Truck Number:");
        TextField truckNumberField = new TextField();
        HBox truckHbox = new HBox(truckNumberLabel,truckNumberField);

        Label driverNumberLabel = new Label("Driver Number:");
        TextField driverNumberField = new TextField();
        HBox driverHbox = new HBox(driverNumberLabel,driverNumberField);


        Label co_driverNumberLabel = new Label("Co-Driver Number:");
        TextField co_driverNumbeField = new TextField();
        HBox co_driverHbox = new HBox(co_driverNumberLabel,co_driverNumbeField);


        Label tripNumberLabel = new Label("Trip Number:");
        TextField tripNumberField = new TextField();
        HBox tripNumberHbox = new HBox(tripNumberLabel,tripNumberField);



        Label dateDepartedLabel = new Label("Date Departed:");
        DatePicker dateDeparted = new DatePicker();
        HBox dateDepartedHbox = new HBox(dateDepartedLabel,dateDeparted);


        Label dateReturnedLabel = new Label("Date Returned:");
        DatePicker dateReturned = new DatePicker();
        HBox dateReturnedHbox = new HBox(dateReturnedLabel,dateReturned);


        Label stateCodeLabel = new Label("State Code:");
        TextField stateCodeField = new TextField();
        HBox stateCodeHbox = new HBox(stateCodeLabel,stateCodeField);

        Label milesDrivenLabel = new Label("Miles Driven:");
        TextField milesDrivenField = new TextField();
        HBox milesDrivenHbox = new HBox(milesDrivenLabel,milesDrivenField);


        Label fuelReceiptLabel = new Label("Fuel Receipt Number:");
        TextField fuelReceiptField = new TextField();
        HBox fuelReceiptHbox = new HBox(fuelReceiptLabel,fuelReceiptField);


        Label gallonsPurchasedLabel = new Label("Gallons Purchased:");
        TextField gallonsPurchasedField = new TextField();
        HBox gallonsPurchasedHbox = new HBox(gallonsPurchasedLabel,gallonsPurchasedField);


        Label taxesPaidLabel = new Label("Taxes Paid:");
        TextField taxesPaidField = new TextField();
        HBox taxesPaidHbox = new HBox(taxesPaidLabel,taxesPaidField);


        Label stationNameLabel = new Label("Station Name:");
        TextField stationNameField = new TextField();
        HBox stationNameHbox = new HBox(stationNameLabel,stationNameField);


        Label stationStreetLabel = new Label("Station Name:");
        TextField stationStreetField = new TextField();
        HBox stationStreetHbox = new HBox(stationStreetLabel,stationStreetField);


        Label stationCityLabel = new Label("Station Name:");
        TextField  stationCityField = new TextField();
        HBox  stationCityHbox = new HBox(stationCityLabel,stationCityField);



        //Adding Listeners


        truckNumberField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                int maxLength = 4;
                if (newValue.length() > maxLength) {
                    String s = newValue.substring(0, maxLength);
                    truckNumberField.setText(s);
                }
                if(!newValue.matches("\\d*"))
                {
                    truckNumberField.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
        driverNumberField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                int maxLength = 9;
                if (newValue.length() > maxLength) {
                    String s = newValue.substring(0, maxLength);
                    driverNumberField.setText(s);
                }
                if(!newValue.matches("\\d*"))
                {
                    driverNumberField.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
        co_driverNumbeField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                int maxLength = 9;
                if (newValue.length() > maxLength) {
                    String s = newValue.substring(0, maxLength);
                    co_driverNumbeField.setText(s);
                }
                if(!newValue.matches("\\d*"))
                {
                    co_driverNumbeField.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
        tripNumberField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                int maxLength = 3;
                if (newValue.length() > maxLength) {
                    String s = newValue.substring(0, maxLength);
                    tripNumberField.setText(s);
                }
                if(!newValue.matches("\\d*"))
                {
                    tripNumberField.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
        stateCodeField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                int maxLength = 2;
                if (newValue.length() > maxLength) {
                    String s = newValue.substring(0, maxLength);
                    stateCodeField.setText(s);
                }
                if(newValue.matches("\\d*"))
                {
                    stateCodeField.setText(newValue.replaceAll("[\\d]", ""));
                }
            }
        });
        milesDrivenField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                int minValue = 0;
                if(newValue.matches("\\d*")){
                    if (Integer.parseInt(newValue) > minValue) {
                        milesDrivenField.setText("0");
                    }
                }

                if(!newValue.matches("\\d*"))
                {
                    milesDrivenField.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });


        fuelReceiptField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                int minValue = 0;
                if(newValue.matches("\\d*")){
                    if (Integer.parseInt(newValue) > minValue) {
                        fuelReceiptField.setText("0");
                    }
                }
                if(!newValue.matches("\\d*"))
                {
                    fuelReceiptField.setText(newValue.replaceAll("[^\\d]", ""));
                }
                int maxLength = 9;
                if (newValue.length() > maxLength) {
                    String s = newValue.substring(0, maxLength);
                    fuelReceiptField.setText(s);
                }
            }
        });
        gallonsPurchasedField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                int minValue = 0;
                if(newValue.matches("\\d*")){
                    if (Integer.parseInt(newValue) > minValue) {
                        gallonsPurchasedField.setText("0");
                    }
                }
                if(!newValue.matches("/^[0-9]+(\\\\.[0-9]+)?$*"))
                {
                    gallonsPurchasedField.setText(newValue.replaceAll("[^\\d]", ""));
                }
                int maxLength = 9;
                if (newValue.length() > maxLength) {
                    String s = newValue.substring(0, maxLength);
                    gallonsPurchasedField.setText(s);
                }
            }
        });

        taxesPaidField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                int minValue = 0;
                if(newValue.matches("\\d*")){
                    if (Integer.parseInt(newValue) > minValue) {
                        taxesPaidField.setText("0");
                    }
                }
                if(!newValue.matches("\\d*"))
                {
                    taxesPaidField.setText(newValue.replaceAll("[^\\d]", ""));
                }
                int maxLength = 3;
                if (newValue.length() > maxLength) {
                    String s = newValue.substring(0, maxLength);
                    taxesPaidField.setText(s);
                }
            }
        });
        stationNameField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                int maxLength = 15;
                if (newValue.length() > maxLength) {
                    String s = newValue.substring(0, maxLength);
                    stationNameField.setText(s);
                }
                if(!newValue.matches("\\d*"))
                {
                    stationNameField.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
        stationCityField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                int maxLength = 15;
                if (newValue.length() > maxLength) {
                    String s = newValue.substring(0, maxLength);
                    stationCityField.setText(s);
                }

            }
        });
        stationStreetField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                int maxLength = 15;
                if (newValue.length() > maxLength) {
                    String s = newValue.substring(0, maxLength);
                    stationStreetField.setText(s);
                }

            }
        });


       sinisterButton.setOnAction(e ->
        {
            Trucker t = new Trucker(
                    Integer.parseInt(truckNumberField.getText()),
                    Integer.parseInt(driverNumberField.getText()),
                    Integer.parseInt(co_driverNumbeField.getText()),
                    Integer.parseInt(tripNumberField.getText()),
                    dateDeparted.getValue().toString(),
                    dateReturned.getValue().toString(),
                    stateCodeField.getText(),
                    Integer.parseInt(milesDrivenField.getText()),
                    Integer.parseInt(fuelReceiptField.getText()),
                    Integer.parseInt(gallonsPurchasedField.getText()),
                    Double.parseDouble(taxesPaidField.getText()),
                    stationNameField.getText(),
                    stationStreetField.getText(),
                    stationCityField.getText()
            );

            truckNumberField.setText("");
            driverNumberField.setText("");
            co_driverNumbeField.setText("");
            tripNumberField.setText("");
            dateDeparted.getEditor().clear();
            dateReturned.getEditor().clear();
            stateCodeField.setText("");
            milesDrivenField.setText("");
            fuelReceiptField.setText("");
            gallonsPurchasedField.setText("");
            taxesPaidField.setText("");
            stationNameField.setText("");
            stationStreetField.setText("");
            stationCityField.setText("");

            DBHandler db = new DBHandler();
            try {
                db.addTrucker(t);
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        });



        Menu truckMenu = new Menu("_Main Menu");
        MenuItem mainMenu= new MenuItem("Truck Menu...");
        truckMenu.getItems().add(mainMenu);
        mainMenu.setOnAction(e -> window.setScene(MainMenuScene));

        Menu entryMenu = new Menu("_Entry Page");
        MenuItem entryMenuItem= new MenuItem("Entry Page...");
        entryMenu.getItems().add(entryMenuItem);
        entryMenuItem.setOnAction(e -> window.setScene(EntryScene));

        BorderPane layout = new BorderPane();

        Menu ReportsMenu = new Menu("Reports");
        MenuItem ExceptionReport= new MenuItem("Exception Report...");
        MenuItem DetailsReport= new MenuItem("Details Report...");
        MenuItem SummaryReport= new MenuItem("Summary Report...");
        ReportsMenu.getItems().add(ExceptionReport);
        ReportsMenu.getItems().add(DetailsReport);
        ReportsMenu.getItems().add(SummaryReport);
        ExceptionReport.setOnAction(e -> window.setScene(ExceptionReportScene));
        DetailsReport.setOnAction(e -> window.setScene(DetailsReportScene));
        SummaryReport.setOnAction(e -> window.setScene(SummaryReportScene));

        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(truckMenu,entryMenu,ReportsMenu);

        layout.setTop(menuBar);

        VBox vbox = new VBox (10,layout,truckHbox,
                driverHbox,
                co_driverHbox,
                dateDepartedHbox,
                dateReturnedHbox,
                stateCodeHbox,
                milesDrivenHbox,
                fuelReceiptHbox,
                gallonsPurchasedHbox,
                taxesPaidHbox,
                stationNameHbox,
                stationStreetHbox,
                stationCityHbox,
                sinisterButton);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(20));

        EntryScene = new Scene(vbox);


    };

    public static void main(String[] args) {
        launch(args);
    }
}
