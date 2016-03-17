(function () {
    var React = require('react'),
	materialUI = require('material-ui'),
	injectTapEventPlugin = require("react-tap-event-plugin");

    window.React = React;
    window.MaterialUI = materialUI;

    //Needed for onTouchTap
    //Can go away when react 1.0 release
    //Check this repo:
    //https://github.com/zilverline/react-tap-event-plugin
    injectTapEventPlugin();
})();
