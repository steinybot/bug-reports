import webpack from 'webpack'

function ruleUses(rule: webpack.RuleSetRule): webpack.RuleSetUseItem[] | undefined {
    const use: webpack.RuleSetUse[] | undefined = rule.use
    return undefined
}
