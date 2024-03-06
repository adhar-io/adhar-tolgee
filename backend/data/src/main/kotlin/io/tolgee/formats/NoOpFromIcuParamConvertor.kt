package io.tolgee.formats

class NoOpFromIcuParamConvertor : FromIcuParamConvertor {
  override fun convert(
    node: MessagePatternUtil.ArgNode,
    isInPlural: Boolean,
  ): String {
    return node.patternString
  }

  override fun convertReplaceNumber(
    node: MessagePatternUtil.MessageContentsNode,
    argName: String?,
  ): String = node.patternString
}