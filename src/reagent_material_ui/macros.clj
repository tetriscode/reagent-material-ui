; shamelessly stolen from https://github.com/tuhlmann/reagent-material

(ns reagent-material-ui.macros)

(def material-tags
  '[
    AppBar
    AutoComplete
    Avatar
    Badge
    Card
    CardActions
    CardExpandable
    CardHeader
    CardMedia
    CardText
    CardTitle
    Checkbox
    CircularProgress
    DatePicker
    Dialog
    Divider
    DropDownMenu
    FlatButton
    FloatingActionButton
    FontIcon
    GridList
    GridTile
    IconButton
    IconMenu
    LeftNav
    LinearProgress
    List
    ListItem
    Menu
    MenuItem
    Paper
    Popover
    RadioButton
    RadioButtonGroup
    RaisedButton
    SelectField
    Slider
    SvgIcon
    Snackbar
    Tab
    Tabs
    Table
    TableBody
    TableFooter
    TableHeader
    TableHeaderColumn
    TableRow
    TableRowColumn
    Toggle
    TimePicker
    TextField
    Toolbar
    ToolbarGroup
    ToolbarSeparator
    ToolbarTitle
    Tooltip
    ])

(defn material-ui-react-import [tname]
  `(def ~tname
     (reagent.core/adapt-react-class (aget js/MaterialUI ~(name tname)))))

(defmacro export-material-ui-react-classes []
  `(do
     ~@(map material-ui-react-import material-tags)
     ))
