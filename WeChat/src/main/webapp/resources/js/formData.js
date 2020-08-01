(function ($) {
    $.fn.extend({
        initForm:function (options) {
            options=JSON.stringify(options)
            //默认参数
            var defaults = {
                jsonValue:options,
                isDebug:false//是否需要调试，这个用于开发阶段，发布阶段庆将设置false，默认为false，true将会把name value打印出来
            }
            //设置参数
            var setting = $.extend({},defaults,options);
            var form = this;
            jsonValue = setting.jsonValue;
            //如果传入的json字符串，将转换为json对象
            if ($.type(setting.jsonValue) == "string"){
                jsonValue = $.parseJSON(jsonValue);
            }
            //如果传入的json对象为空，则不做任何操作
            if (!$.isEmptyObject(jsonValue)){
                var debugInfo = "";
                $.each(jsonValue,function (key,value) {
                    //是否开启调试，开启将会把name value打印出来
                    if (setting.isDebug){
                        debugInfo += "name:" + key + ";value:" + value + "||";
                    }
                    var formField = form.find("[name='" + key + "']");
                    if ($.type(formField[0]) === "undefined"){
                        if (setting.isDebug){
                            //alert("can not find name:["+key + "]in form!!!");//没找到指定hame的表单
                        }
                    }else {
                        var fieldTagName = formField[0].tagName.toLowerCase();
                        if (fieldTagName == "input"){
                            if (formField.attr("type") == "radio"){
                                console.log('----'+value)
                                $("input:radio[name='" + key + "'][value='"+ value + "']").attr("checked","checked");
                            }else {
                                formField.val(value);
                            }
                        }else if (fieldTagName == "select") {
                            formField.val(value);
                        }else if (fieldTagName == "textarea"){
                            formField.val(value);
                        }else{
                            formField.val(value);
                        }
                    }
                })
                if (setting.isDebug){
                    alert(debugInfo);
                }
            }
            return form;
        }
    });
})(jQuery)