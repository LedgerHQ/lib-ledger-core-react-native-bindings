// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from preferences.djinni

#ifndef DJINNI_GENERATED_PREFERENCESEDITOR_HPP
#define DJINNI_GENERATED_PREFERENCESEDITOR_HPP

#include <cstdint>
#include <memory>
#include <string>
#include <vector>

namespace ledger { namespace core { namespace api {

/** Interface for editting Preferences. All changes to the editor are persisted to the disk only when comitted. */
class PreferencesEditor {
public:
    virtual ~PreferencesEditor() {}

    /**
     * Sets the value to the given key in the Preferences.
     * @param key The data key.
     * @param value The value to store
     * @return The reference of self in order to chain the call to the editor.
     */
    virtual std::shared_ptr<PreferencesEditor> putString(const std::string & key, const std::string & value) = 0;

    /**
     * Sets the value to the given key in the Preferences.
     * @param key The data key.
     * @param value The value to store
     * @return The reference of self in order to chain the call to the editor.
     */
    virtual std::shared_ptr<PreferencesEditor> putInt(const std::string & key, int32_t value) = 0;

    /**
     * Sets the value to the given key in the Preferences.
     * @param key The data key.
     * @param value The value to store
     * @return The reference of self in order to chain the call to the editor.
     */
    virtual std::shared_ptr<PreferencesEditor> putLong(const std::string & key, int64_t value) = 0;

    /**
     * Sets the value to the given key in the Preferences.
     * @param key The data key.
     * @param value The value to store
     * @return The reference of self in order to chain the call to the editor.
     */
    virtual std::shared_ptr<PreferencesEditor> putBoolean(const std::string & key, bool value) = 0;

    /**
     * Sets the value to the given key in the Preferences.
     * @param key The data key.
     * @param value The value to store
     * @return The reference of self in order to chain the call to the editor.
     */
    virtual std::shared_ptr<PreferencesEditor> putStringArray(const std::string & key, const std::vector<std::string> & value) = 0;

    /**
     * Sets the value to the given key in the Preferences.
     * @param key The data key.
     * @param value The value to store
     * @return The reference of self in order to chain the call to the editor.
     */
    virtual std::shared_ptr<PreferencesEditor> putData(const std::string & key, const std::vector<uint8_t> & value) = 0;

    /**
     * Removes the data associated with the given key.
     * @param key The key to remove from the Preferences
     * @return The reference of self in order to chain the call to the editor.
     */
    virtual std::shared_ptr<PreferencesEditor> remove(const std::string & key) = 0;

    /** Persists the changes to the Preferences. */
    virtual void commit() = 0;

    /** Clear all preferences. */
    virtual void clear() = 0;
};

} } }  // namespace ledger::core::api
#endif //DJINNI_GENERATED_PREFERENCESEDITOR_HPP
