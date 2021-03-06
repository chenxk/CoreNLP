package edu.stanford.nlp.trees.international.spanish;

import java.io.Reader;
import java.io.Serializable;

import edu.stanford.nlp.trees.*;

/**
 * A class for reading Spanish Treebank trees that have been converted
 * from XML to PTB format.
 *
 * @author Spence Green
 */
public class SpanishXMLTreeReaderFactory implements TreeReaderFactory, Serializable {

  private static final long serialVersionUID = 2019486878175311263L;

  private final boolean simplifiedTagset;
  private final boolean aggressiveNormalization;
  private final boolean retainNER;
  private final boolean detailedAnnotations;

  // Initialize with default options
  public SpanishXMLTreeReaderFactory() {
    this(true, true, false, false);
  }

  public SpanishXMLTreeReaderFactory(boolean simplifiedTagset,
                                     boolean aggressiveNormalization,
                                     boolean retainNER,
                                     boolean detailedAnnotations) {
    this.simplifiedTagset = simplifiedTagset;
    this.aggressiveNormalization = aggressiveNormalization;
    this.retainNER = retainNER;
    this.detailedAnnotations = detailedAnnotations;
  }

  public TreeReader newTreeReader(Reader in) {
    return new SpanishXMLTreeReader(null, in, simplifiedTagset, aggressiveNormalization,
      retainNER, detailedAnnotations);
  }

  public TreeReader newTreeReader(String path, Reader in) {
    return new SpanishXMLTreeReader(path, in, simplifiedTagset, aggressiveNormalization,
      retainNER, detailedAnnotations);
  }
}
