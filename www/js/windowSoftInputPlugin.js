var windowSoftInputPlugin = {
    setInputAdjustPan: function () {
        cordova.exec(null, null, "windowSoftInputPlugin", "setInputAdjustPan", [""]);
    },
    
    setInputAdjustResize: function () {
        cordova.exec(null, null, "windowSoftInputPlugin", "setInputAdjustResize", [""]);
    }, 

    setInputAdjustUnspecified: function () {
        cordova.exec(null, null, "windowSoftInputPlugin", "setInputAdjustUnspecified", [""]);
    },

    setFullScreenFlag: function () {
        cordova.exec(null, null, "windowSoftInputPlugin", "setFullScreenFlag", [""]);
    },
    
    unsetFullScreenFlag: function () {
        cordova.exec(null, null, "windowSoftInputPlugin", "unsetFullScreenFlag", [""]);
    }
};
module.exports = windowSoftInputPlugin;
