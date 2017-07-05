(ns reagent-material-ui.core-test
  (:require [cljs.test :refer-macros [deftest is are testing run-tests]]
            [reagent-material-ui.core :as m]
            ))

(deftest components
  (testing "Components should exist")
  (are [component] ((complement nil?) component)
       m/AppBar
       m/AutoComplete
       m/Avatar
       m/Badge
       m/BottomNavigation
       m/Card
       m/CardActions
       m/CardHeader
       m/CardMedia
       m/CardText
       m/CardTitle
       m/Checkbox
       m/Chip
       m/CircularProgress
       m/DatePicker
       m/Dialog
       m/Divider
       m/Drawer
       m/DropDownMenu
       m/FlatButton
       m/FloatingActionButton
       m/FontIcon
       m/GridList
       m/GridTile
       m/IconButton
       m/IconMenu
       m/LinearProgress
       m/List
       m/ListItem
       m/Menu
       m/MenuItem
       m/Paper
       m/Popover
       m/RadioButton
       m/RadioButtonGroup
       m/RaisedButton
       m/RefreshIndicator
       m/SelectField
       m/Slider
       m/Snackbar
       m/Step
       m/StepButton
       m/StepContent
       m/StepLabel
       m/Stepper
       m/Subheader
       m/SvgIcon
       m/Tab
       m/Tabs
       m/Table
       m/TableBody
       m/TableFooter
       m/TableHeader
       m/TableHeaderColumn
       m/TableRow
       m/TableRowColumn
       m/TimePicker
       m/TextField
       m/Toggle
       m/Toolbar
       m/ToolbarGroup
       m/ToolbarSeparator
       m/ToolbarTitle
       ))


