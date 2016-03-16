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
       m/Card
       m/CardActions
       m/CardExpandable
       m/CardHeader
       m/CardMedia
       m/CardText
       m/CardTitle
       m/Checkbox
       m/CircularProgress
       m/DatePicker
       m/Dialog
       m/Divider
       m/DropDownMenu
       m/FlatButton
       m/FloatingActionButton
       m/FontIcon
       m/GridList
       m/GridTile
       m/IconButton
       m/IconMenu
       m/LeftNav
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
       m/SelectField
       m/Slider
       m/SvgIcon
       m/Snackbar
       m/Tab
       m/Tabs
       m/Table
       m/TableBody
       m/TableFooter
       m/TableHeader
       m/TableHeaderColumn
       m/TableRow
       m/TableRowColumn
       m/Toggle
       m/TimePicker
       m/TextField
       m/Toolbar
       m/ToolbarGroup
       m/ToolbarSeparator
       m/ToolbarTitle
       m/Tooltip
       ))


