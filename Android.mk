LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE_TAGS := optional

LOCAL_MODULE := MithrilAC

LOCAL_CERTIFICATE := platform

LOCAL_SRC_FILES := MithrilAC.apk

LOCAL_MODULE_CLASS := APPS

LOCAL_MODULE_SUFFIX := $(COMMON_ANDROID_PACKAGE_SUFFIX)

include $(BUILD_PREBUILT)
