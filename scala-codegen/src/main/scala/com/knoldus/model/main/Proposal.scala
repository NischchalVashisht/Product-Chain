/*
 * THIS FILE WAS AUTOGENERATED BY THE DIGITAL ASSET DAML SCALA CODE GENERATOR
 * DO NOT EDIT BY HAND!
 */
import _root_.com.digitalasset.ledger.client.{binding=>$u0020lfdomainapi}
import _root_.com.digitalasset.ledger.api.v1.{value=>$u0020rpcvalue}
package com.knoldus.model {
  package Main {
    final case class Proposal(product: com.knoldus.model.Main.Product) extends ` lfdomainapi`.Template[Proposal] {
      override protected[this] def templateCompanion(implicit ` d` : _root_.scala.Predef.DummyImplicit) = Proposal
    }

    object Proposal extends ` lfdomainapi`.TemplateCompanion[Proposal] with _root_.scala.Function1[com.knoldus.model.Main.Product, _root_.com.knoldus.model.Main.Proposal] {
      import _root_.scala.language.higherKinds;
      trait view[` C`[_]] extends ` lfdomainapi`.encoding.RecordView[` C`, view] { $u0020view =>
        val product: ` C`[com.knoldus.model.Main.Product];
        final override def hoist[` D`[_]](` f` : _root_.scalaz.~>[` C`, ` D`]): view[` D`] = {
          final class $anon extends _root_.scala.AnyRef with view[` D`] {
            override val product = ` f`(` view`.product)
          };
          new $anon()
        }
      };
      override val id = ` templateId`(packageId = `Package IDs`.Main, moduleName = "Main", entityName = "Proposal");
      final implicit class `Proposal syntax`[+` ExOn`](private val id: ` ExOn`) extends _root_.scala.AnyVal {
        def exerciseIouProposal_Accept(actor: ` lfdomainapi`.Primitive.Party, choiceArgument: com.knoldus.model.Main.IouProposal_Accept)(implicit ` exOn` : ` lfdomainapi`.encoding.ExerciseOn[` ExOn`, Proposal]): ` lfdomainapi`.Primitive.Update[` lfdomainapi`.Primitive.ContractId[com.knoldus.model.Main.Product]] = ` exercise`(id, "IouProposal_Accept", _root_.scala.Some(` lfdomainapi`.Value.encode(choiceArgument)));
        def exerciseIouProposal_Accept(actor: ` lfdomainapi`.Primitive.Party)(implicit ` exOn` : ` lfdomainapi`.encoding.ExerciseOn[` ExOn`, Proposal]): ` lfdomainapi`.Primitive.Update[` lfdomainapi`.Primitive.ContractId[com.knoldus.model.Main.Product]] = exerciseIouProposal_Accept(actor, _root_.com.knoldus.model.Main.IouProposal_Accept());
        def exerciseArchive(actor: ` lfdomainapi`.Primitive.Party, choiceArgument: com.knoldus.model.DA.Internal.Template.Archive)(implicit ` exOn` : ` lfdomainapi`.encoding.ExerciseOn[` ExOn`, Proposal]): ` lfdomainapi`.Primitive.Update[` lfdomainapi`.Primitive.Unit] = ` exercise`(id, "Archive", _root_.scala.Some(` lfdomainapi`.Value.encode(choiceArgument)));
        def exerciseArchive(actor: ` lfdomainapi`.Primitive.Party)(implicit ` exOn` : ` lfdomainapi`.encoding.ExerciseOn[` ExOn`, Proposal]): ` lfdomainapi`.Primitive.Update[` lfdomainapi`.Primitive.Unit] = exerciseArchive(actor, _root_.com.knoldus.model.DA.Internal.Template.Archive())
      };
      override val consumingChoices: Set[` lfdomainapi`.Primitive.ChoiceId] = ` lfdomainapi`.Primitive.ChoiceId.subst(Set("IouProposal_Accept", "Archive"));
      override def toNamedArguments(` self` : Proposal) = ` arguments`(scala.Tuple2("product", ` lfdomainapi`.Value.encode(` self`.product)));
      override def fromNamedArguments(` r` : ` rpcvalue`.Record) = if (` r`.fields.length.==(1))
        ` r`.fields(0) match {
          case ` rpcvalue`.RecordField((""| "product"), _root_.scala.Some(zv0)) => (` lfdomainapi`.Value.decode[com.knoldus.model.Main.Product](zv0) match {
            case _root_.scala.Some(z0) => Some(Proposal(z0))
            case _root_.scala.None => _root_.scala.None
          })
          case _ => _root_.scala.None
        }
      else
        _root_.scala.None;
      override def fieldEncoding(lte: ` lfdomainapi`.encoding.LfTypeEncoding): view[lte.Field] = {
        object `view ` extends view[lte.Field] {
          val product = lte.field("product", ` lfdomainapi`.encoding.LfEncodable.encoding[com.knoldus.model.Main.Product](lte))
        };
        `view `
      };
      override def encoding(lte: ` lfdomainapi`.encoding.LfTypeEncoding)(`view `: view[lte.Field]): lte.Out[_root_.com.knoldus.model.Main.Proposal] = {
        val `recordFields `: lte.RecordFields[_root_.com.knoldus.model.Main.Proposal] = lte.RecordFields.xmapN(lte.fields(`view `.product))({
          case product => _root_.com.knoldus.model.Main.Proposal(product)
        })({
          case _root_.com.knoldus.model.Main.Proposal(product) => product
        });
        lte.record(` dataTypeId`, `recordFields `)
      }
    }
  }
}
