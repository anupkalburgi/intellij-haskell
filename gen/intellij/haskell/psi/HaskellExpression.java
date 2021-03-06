// This is a generated file. Not intended for manual editing.
package intellij.haskell.psi;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface HaskellExpression extends HaskellExpressionElement {

    @NotNull
    List<HaskellDotDot> getDotDotList();

    @NotNull
    List<HaskellPragma> getPragmaList();

    @NotNull
    List<HaskellQName> getQNameList();

    @NotNull
    List<HaskellReservedId> getReservedIdList();

    @NotNull
    List<HaskellTextLiteral> getTextLiteralList();

}
