(ns reagent-material-ui.core-test
  (:require [cljs.test :refer-macros [deftest is are testing run-tests]]
            [reagent-material-ui.core :refer [AppBar
                                              Avatar
                                              Card
                                              CardActions
                                              CardHeader
                                              CardMedia
                                              CardText
                                              CardTitle
                                              Checkbox
                                              CircularProgress
                                              FlatButton
                                              FontIcon
                                              GridList
                                              GridTile
                                              IconButton
                                              List
                                              ListItem
                                              Paper
                                              RaisedButton
                                              Slider
                                              Tabs
                                              Tab
                                              TextField]]
            [reagent.impl.component :refer [reagent-class?]]))
(deftest components
  (testing "Components should exist")
  (are [component] ((complement nil?) component)
    AppBar
    Avatar
    Card
    CardActions
    CardHeader
    CardMedia
    CardText
    CardTitle
    Checkbox
    CircularProgress
    FlatButton
    FontIcon
    GridList
    GridTile
    IconButton
    List
    ListItem
    Paper
    RaisedButton
    Slider
    Tabs
    Tab
    TextField))


