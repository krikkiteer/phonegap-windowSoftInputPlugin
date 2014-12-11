var windowSoftInputPlugin = {
    setInputAdjustPan: function () {
        cordova.exec(s, f, "windowSoftInputPlugin", "setInputAdjustPan", [""]);
    },
    
    setInputAdjustResize: function () {
        cordova.exec(s, f, "windowSoftInputPlugin", "setInputAdjustResize", [""]);
    }, 

    setInputAdjustUnspecified: function () {
        cordova.exec(s, f, "windowSoftInputPlugin", "setInputAdjustUnspecified", [""]);
    },

    setFullScreenFlag: function () {
        cordova.exec(s, f, "windowSoftInputPlugin", "setFullScreenFlag", [""]);
    },

    unsetFullScreenFlag: function () {
        cordova.exec(s, f, "windowSoftInputPlugin", "unsetFullScreenFlag", [""]);
    }
};
module.exports = windowSoftInputPlugin;
