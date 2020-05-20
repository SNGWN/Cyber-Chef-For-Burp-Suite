# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).


## [1.1.0] - 2020-05-20

### Added

* Add additional operations:
  * *LineExtractor* (Extracts a specific line from a *HTTP* request/response).
  * *LineSetter* (Sets a specific line in a *HTTP* request/response).
  * *RandomNumber* (Simply generates a random number).
  * *SetIfEmpty* (Sets a value if the incoming data is empty).
  * *SplitAndSelect* (Splits the input string and selects one item).

### Changed

* Change variable prefix to ``$`` (from previously ``§``)
* Update workflow demonstration (GIF inside README.md)


## [1.0.0] - 2020-04-22

### Added

* Support operating on raw byte data.
* Enable context menu inside the CSTC pane.
* Add additional operations:
  * *Divide* (Divide input by the given number).
  * *Multiply* (Multiply input with the given number).
  * *HttpCookieExtractor* (Extract cookies from *HTTP* requests).
  * *HeaderSetter* (Set *HTTP* headers).
  * *HttpSetBody* (Set *HTTP* body).
  * *HttpSetCookie* (Set *HTTP* cookie).
  * *HttpJsonSetter* (Set a JSON field in a HTTP request).
  * *JsonSetter* (Set a value inside of a JSON string).
  * *PostSetter* (Set a POST parameter).
  * *XmlSetter* (Set a XML field in a HTTP request ).
  * *HttpXmlExtractor* (Get a XML value from a HTTP request).
  * *HttpJsonExtractor* (Get a JSON value from a HTTP request).
* Add workflow demonstration in form of a GIF to README.md
* Add a changelog :)

### Changed

* Fix typos in several modules.
* Ignore the *IV* parameter when using encryption modules in *ECB* mode.
* Support *raw* encoding for *FormattedTextFields*.
* Make all operations work on raw bytes.
* Implement the so far unimplemented input and output modes for encryption modules.
* Correct syntax highlighting inside the CSTC pane.
* Fix bugs in several different modules.
* Update version of *jackson-databind*.
* Adjust image icons displayed inside the nodetree.

### Removed

* Remove *FlowControl* and *Language* operation categories, as they are currently unused.
* Remove *ReplaceBody* (was substituted by *HttpSetBody*).


## [0.1.1] - 2019-08-20

### Added

* Initial release.