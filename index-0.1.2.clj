{:namespaces
 ({:doc
   "System for filtering trees and nodes generated by zip.clj in\ngeneral, and xml trees in particular.",
   :author "Chris Houser",
   :name "clojure.data.zip",
   :wiki-url
   "http://clojure.github.com/data.zip/clojure.data.zip-api.html",
   :source-url
   "https://github.com/clojure/data.zip/blob/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip.clj"}
  {:doc nil,
   :name "clojure.data.zip.xml",
   :wiki-url
   "http://clojure.github.com/data.zip/clojure.data.zip.xml-api.html",
   :source-url
   "https://github.com/clojure/data.zip/blob/cca24641e14a043452bf4619c3c81865d1433fab/src/main/clojure/clojure/data/zip/xml.clj"}),
 :vars
 ({:raw-source-url
   "https://github.com/clojure/data.zip/raw/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip.clj",
   :name "ancestors",
   :file "src/main/clojure/clojure/data/zip.clj",
   :source-url
   "https://github.com/clojure/data.zip/blob/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip.clj#L62",
   :line 62,
   :var-type "function",
   :arglists ([loc]),
   :doc
   "Returns a lazy sequence of all ancestors of location loc, starting\nwith loc and proceeding to loc's parent node and on through to the\nroot of the tree.",
   :namespace "clojure.data.zip",
   :wiki-url
   "http://clojure.github.com/data.zip//clojure.data.zip-api.html#clojure.data.zip/ancestors"}
  {:raw-source-url
   "https://github.com/clojure/data.zip/raw/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip.clj",
   :name "children",
   :file "src/main/clojure/clojure/data/zip.clj",
   :source-url
   "https://github.com/clojure/data.zip/blob/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip.clj#L42",
   :line 42,
   :var-type "function",
   :arglists ([loc]),
   :doc
   "Returns a lazy sequence of all immediate children of location loc,\nleft-to-right.",
   :namespace "clojure.data.zip",
   :wiki-url
   "http://clojure.github.com/data.zip//clojure.data.zip-api.html#clojure.data.zip/children"}
  {:raw-source-url
   "https://github.com/clojure/data.zip/raw/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip.clj",
   :name "children-auto",
   :file "src/main/clojure/clojure/data/zip.clj",
   :source-url
   "https://github.com/clojure/data.zip/blob/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip.clj#L49",
   :line 49,
   :var-type "function",
   :arglists ([loc]),
   :doc
   "Returns a lazy sequence of all immediate children of location loc,\nleft-to-right, marked so that a following tag= predicate will auto-descend.",
   :namespace "clojure.data.zip",
   :wiki-url
   "http://clojure.github.com/data.zip//clojure.data.zip-api.html#clojure.data.zip/children-auto"}
  {:raw-source-url
   "https://github.com/clojure/data.zip/raw/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip.clj",
   :name "descendants",
   :file "src/main/clojure/clojure/data/zip.clj",
   :source-url
   "https://github.com/clojure/data.zip/blob/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip.clj#L57",
   :line 57,
   :var-type "function",
   :arglists ([loc]),
   :doc
   "Returns a lazy sequence of all descendants of location loc, in\ndepth-first order, left-to-right, starting with loc.",
   :namespace "clojure.data.zip",
   :wiki-url
   "http://clojure.github.com/data.zip//clojure.data.zip-api.html#clojure.data.zip/descendants"}
  {:raw-source-url
   "https://github.com/clojure/data.zip/raw/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip.clj",
   :name "left-locs",
   :file "src/main/clojure/clojure/data/zip.clj",
   :source-url
   "https://github.com/clojure/data.zip/blob/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip.clj#L30",
   :line 30,
   :var-type "function",
   :arglists ([loc]),
   :doc
   "Returns a lazy sequence of locations to the left of loc, starting with loc.",
   :namespace "clojure.data.zip",
   :wiki-url
   "http://clojure.github.com/data.zip//clojure.data.zip-api.html#clojure.data.zip/left-locs"}
  {:raw-source-url
   "https://github.com/clojure/data.zip/raw/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip.clj",
   :name "leftmost?",
   :file "src/main/clojure/clojure/data/zip.clj",
   :source-url
   "https://github.com/clojure/data.zip/blob/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip.clj#L34",
   :line 34,
   :var-type "function",
   :arglists ([loc]),
   :doc
   "Returns true if there are no more nodes to the left of location loc.",
   :namespace "clojure.data.zip",
   :wiki-url
   "http://clojure.github.com/data.zip//clojure.data.zip-api.html#clojure.data.zip/leftmost?"}
  {:raw-source-url
   "https://github.com/clojure/data.zip/raw/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip.clj",
   :name "right-locs",
   :file "src/main/clojure/clojure/data/zip.clj",
   :source-url
   "https://github.com/clojure/data.zip/blob/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip.clj#L26",
   :line 26,
   :var-type "function",
   :arglists ([loc]),
   :doc
   "Returns a lazy sequence of locations to the right of loc, starting with loc.",
   :namespace "clojure.data.zip",
   :wiki-url
   "http://clojure.github.com/data.zip//clojure.data.zip-api.html#clojure.data.zip/right-locs"}
  {:raw-source-url
   "https://github.com/clojure/data.zip/raw/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip.clj",
   :name "rightmost?",
   :file "src/main/clojure/clojure/data/zip.clj",
   :source-url
   "https://github.com/clojure/data.zip/blob/ca5a2efcc1c865baa25f904d7d9f027809b8f738/src/main/clojure/clojure/data/zip.clj#L38",
   :line 38,
   :var-type "function",
   :arglists ([loc]),
   :doc
   "Returns true if there are no more nodes to the right of location loc.",
   :namespace "clojure.data.zip",
   :wiki-url
   "http://clojure.github.com/data.zip//clojure.data.zip-api.html#clojure.data.zip/rightmost?"}
  {:raw-source-url
   "https://github.com/clojure/data.zip/raw/cca24641e14a043452bf4619c3c81865d1433fab/src/main/clojure/clojure/data/zip/xml.clj",
   :name "attr",
   :file "src/main/clojure/clojure/data/zip/xml.clj",
   :source-url
   "https://github.com/clojure/data.zip/blob/cca24641e14a043452bf4619c3c81865d1433fab/src/main/clojure/clojure/data/zip/xml.clj#L16",
   :line 16,
   :var-type "function",
   :arglists ([attrname] [loc attrname]),
   :doc
   "Returns the xml attribute named attrname, of the xml node at location loc.",
   :namespace "clojure.data.zip.xml",
   :wiki-url
   "http://clojure.github.com/data.zip//clojure.data.zip-api.html#clojure.data.zip.xml/attr"}
  {:raw-source-url
   "https://github.com/clojure/data.zip/raw/cca24641e14a043452bf4619c3c81865d1433fab/src/main/clojure/clojure/data/zip/xml.clj",
   :name "attr=",
   :file "src/main/clojure/clojure/data/zip/xml.clj",
   :source-url
   "https://github.com/clojure/data.zip/blob/cca24641e14a043452bf4619c3c81865d1433fab/src/main/clojure/clojure/data/zip/xml.clj#L21",
   :line 21,
   :var-type "function",
   :arglists ([attrname attrval]),
   :doc
   "Returns a query predicate that matches a node when it has an\nattribute named attrname whose value is attrval.",
   :namespace "clojure.data.zip.xml",
   :wiki-url
   "http://clojure.github.com/data.zip//clojure.data.zip-api.html#clojure.data.zip.xml/attr="}
  {:raw-source-url
   "https://github.com/clojure/data.zip/raw/cca24641e14a043452bf4619c3c81865d1433fab/src/main/clojure/clojure/data/zip/xml.clj",
   :name "seq-test",
   :file "src/main/clojure/clojure/data/zip/xml.clj",
   :source-url
   "https://github.com/clojure/data.zip/blob/cca24641e14a043452bf4619c3c81865d1433fab/src/main/clojure/clojure/data/zip/xml.clj#L49",
   :line 49,
   :var-type "function",
   :arglists ([preds]),
   :doc
   "Returns a query predicate that matches a node when its xml content\nmatches the query expresions given.",
   :namespace "clojure.data.zip.xml",
   :wiki-url
   "http://clojure.github.com/data.zip//clojure.data.zip-api.html#clojure.data.zip.xml/seq-test"}
  {:raw-source-url
   "https://github.com/clojure/data.zip/raw/cca24641e14a043452bf4619c3c81865d1433fab/src/main/clojure/clojure/data/zip/xml.clj",
   :name "tag=",
   :file "src/main/clojure/clojure/data/zip/xml.clj",
   :source-url
   "https://github.com/clojure/data.zip/blob/cca24641e14a043452bf4619c3c81865d1433fab/src/main/clojure/clojure/data/zip/xml.clj#L26",
   :line 26,
   :var-type "function",
   :arglists ([tagname]),
   :doc
   "Returns a query predicate that matches a node when its is a tag\nnamed tagname.",
   :namespace "clojure.data.zip.xml",
   :wiki-url
   "http://clojure.github.com/data.zip//clojure.data.zip-api.html#clojure.data.zip.xml/tag="}
  {:raw-source-url
   "https://github.com/clojure/data.zip/raw/cca24641e14a043452bf4619c3c81865d1433fab/src/main/clojure/clojure/data/zip/xml.clj",
   :name "text",
   :file "src/main/clojure/clojure/data/zip/xml.clj",
   :source-url
   "https://github.com/clojure/data.zip/blob/cca24641e14a043452bf4619c3c81865d1433fab/src/main/clojure/clojure/data/zip/xml.clj#L36",
   :line 36,
   :var-type "function",
   :arglists ([loc]),
   :doc
   "Returns the textual contents of the given location, similar to\nxpaths's value-of",
   :namespace "clojure.data.zip.xml",
   :wiki-url
   "http://clojure.github.com/data.zip//clojure.data.zip-api.html#clojure.data.zip.xml/text"}
  {:raw-source-url
   "https://github.com/clojure/data.zip/raw/cca24641e14a043452bf4619c3c81865d1433fab/src/main/clojure/clojure/data/zip/xml.clj",
   :name "text=",
   :file "src/main/clojure/clojure/data/zip/xml.clj",
   :source-url
   "https://github.com/clojure/data.zip/blob/cca24641e14a043452bf4619c3c81865d1433fab/src/main/clojure/clojure/data/zip/xml.clj#L44",
   :line 44,
   :var-type "function",
   :arglists ([s]),
   :doc
   "Returns a query predicate that matches a node when its textual\ncontent equals s.",
   :namespace "clojure.data.zip.xml",
   :wiki-url
   "http://clojure.github.com/data.zip//clojure.data.zip-api.html#clojure.data.zip.xml/text="}
  {:raw-source-url
   "https://github.com/clojure/data.zip/raw/cca24641e14a043452bf4619c3c81865d1433fab/src/main/clojure/clojure/data/zip/xml.clj",
   :name "xml->",
   :file "src/main/clojure/clojure/data/zip/xml.clj",
   :source-url
   "https://github.com/clojure/data.zip/blob/cca24641e14a043452bf4619c3c81865d1433fab/src/main/clojure/clojure/data/zip/xml.clj#L55",
   :line 55,
   :var-type "function",
   :arglists ([loc & preds]),
   :doc
   "The loc is passed to the first predicate.  If the predicate returns\na collection, each value of the collection is passed to the next\npredicate.  If it returns a location, the location is passed to the\nnext predicate.  If it returns true, the input location is passed to\nthe next predicate.  If it returns false or nil, the next predicate\nis not called.\n\nThis process is repeated, passing the processed results of each\npredicate to the next predicate.  xml-> returns the final sequence.\nThe entire chain is evaluated lazily.\n\nThere are also special predicates: keywords are converted to tag=,\nstrings to text=, and vectors to sub-queries that return true if\nthey match.\n\nSee the footer of zip-query.clj for examples.",
   :namespace "clojure.data.zip.xml",
   :wiki-url
   "http://clojure.github.com/data.zip//clojure.data.zip-api.html#clojure.data.zip.xml/xml->"}
  {:raw-source-url
   "https://github.com/clojure/data.zip/raw/cca24641e14a043452bf4619c3c81865d1433fab/src/main/clojure/clojure/data/zip/xml.clj",
   :name "xml1->",
   :file "src/main/clojure/clojure/data/zip/xml.clj",
   :source-url
   "https://github.com/clojure/data.zip/blob/cca24641e14a043452bf4619c3c81865d1433fab/src/main/clojure/clojure/data/zip/xml.clj#L78",
   :line 78,
   :var-type "function",
   :arglists ([loc & preds]),
   :doc
   "Returns the first item from loc based on the query predicates\ngiven.  See xml->",
   :namespace "clojure.data.zip.xml",
   :wiki-url
   "http://clojure.github.com/data.zip//clojure.data.zip-api.html#clojure.data.zip.xml/xml1->"})}
